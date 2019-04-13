package typings
package awsDashSdkLib.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  /**
    * The type of text that's recognized in a block. In text-detection operations, the following types are returned:    PAGE - Contains a list of the LINE Block objects that are detected on a specific page.    WORD - One or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of equally spaced words.   In text analysis operations, the following types are returned:    PAGE - Contains a list of child Block objects that are detected on a specific page.    KEY_VALUE_SET - Stores the KEY and VALUE Block objects for a field that's detected in a document. Use the EntityType field to determine if a KEY_VALUE_SET object is a KEY Block object or a VALUE Block object.     WORD - One or more ISO basic Latin script characters that aren't separated by spaces.    LINE - A string of tab-delimited, contiguous words.    TABLE - A table that's detected in the document.    CELL - A cell within a detected table. The cell is the parent of the block that contains the text in the cell.  
    */
  var BlockType: js.UndefOr[BlockType] = js.undefined
  /**
    * The column in which a table cell appears. The first column position is 1. ColumnIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var ColumnIndex: js.UndefOr[UInteger] = js.undefined
  /**
    * The number of columns that a table cell spans. ColumnSpan isn't returned by DetectDocumentText and GetDocumentTextDetection. 
    */
  var ColumnSpan: js.UndefOr[UInteger] = js.undefined
  /**
    * The confidence that Amazon Textract has in the accuracy of the recognized text and the accuracy of the geometry points around the recognized text.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * The type of entity. The following can be returned:    KEY - An identifier for a field on the document.    VALUE - The field text.    EntityTypes isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var EntityTypes: js.UndefOr[EntityTypes] = js.undefined
  /**
    * The location of the recognized text on the image. It includes an axis-aligned, coarse bounding box that surrounds the text, and a finer-grain polygon for more accurate spatial information. 
    */
  var Geometry: js.UndefOr[Geometry] = js.undefined
  /**
    * The identifier for the recognized text. The identifier is only unique for a single operation. 
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The page in which a block was detected.
    */
  var Page: js.UndefOr[UInteger] = js.undefined
  /**
    * A list of child blocks of the current block. For example a LINE object has child blocks for each WORD block that's part of the line of text. There aren't Relationship objects in the list for relationships that don't exist, such as when the current block has no child blocks. The list size can be the following:   0 - The block has no child blocks.   1 - The block has child blocks.  
    */
  var Relationships: js.UndefOr[RelationshipList] = js.undefined
  /**
    * The row in which a table cell is located. The first row position is 1. RowIndex isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowIndex: js.UndefOr[UInteger] = js.undefined
  /**
    * The number of rows that a table spans. RowSpan isn't returned by DetectDocumentText and GetDocumentTextDetection.
    */
  var RowSpan: js.UndefOr[UInteger] = js.undefined
  /**
    * The word or line of text that's recognized by Amazon Textract. 
    */
  var Text: js.UndefOr[String] = js.undefined
}

object Block {
  @scala.inline
  def apply(
    BlockType: BlockType = null,
    ColumnIndex: js.UndefOr[UInteger] = js.undefined,
    ColumnSpan: js.UndefOr[UInteger] = js.undefined,
    Confidence: js.UndefOr[Percent] = js.undefined,
    EntityTypes: EntityTypes = null,
    Geometry: Geometry = null,
    Id: NonEmptyString = null,
    Page: js.UndefOr[UInteger] = js.undefined,
    Relationships: RelationshipList = null,
    RowIndex: js.UndefOr[UInteger] = js.undefined,
    RowSpan: js.UndefOr[UInteger] = js.undefined,
    Text: String = null
  ): Block = {
    val __obj = js.Dynamic.literal()
    if (BlockType != null) __obj.updateDynamic("BlockType")(BlockType.asInstanceOf[js.Any])
    if (!js.isUndefined(ColumnIndex)) __obj.updateDynamic("ColumnIndex")(ColumnIndex)
    if (!js.isUndefined(ColumnSpan)) __obj.updateDynamic("ColumnSpan")(ColumnSpan)
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    if (EntityTypes != null) __obj.updateDynamic("EntityTypes")(EntityTypes)
    if (Geometry != null) __obj.updateDynamic("Geometry")(Geometry)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(Page)) __obj.updateDynamic("Page")(Page)
    if (Relationships != null) __obj.updateDynamic("Relationships")(Relationships)
    if (!js.isUndefined(RowIndex)) __obj.updateDynamic("RowIndex")(RowIndex)
    if (!js.isUndefined(RowSpan)) __obj.updateDynamic("RowSpan")(RowSpan)
    if (Text != null) __obj.updateDynamic("Text")(Text)
    __obj.asInstanceOf[Block]
  }
}

