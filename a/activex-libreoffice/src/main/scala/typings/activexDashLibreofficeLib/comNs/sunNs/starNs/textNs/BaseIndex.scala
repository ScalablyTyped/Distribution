package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the basic service of different indexes within a document.
  * @see com.sun.star.text.DocumentIndex
  * @see com.sun.star.text.ContentIndex
  * @see com.sun.star.text.UserDefinedIndex
  * @see com.sun.star.text.IllustrationsIndex
  * @see com.sun.star.text.TableIndex
  * @see com.sun.star.text.ObjectIndex
  */
trait BaseIndex
  extends XDocumentIndex
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable {
  /** specifies the color of the background. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the filter of the graphic file that is displayed as background graphic */
  var BackGraphicFilter: java.lang.String
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL of a graphic file that is displayed as background graphic */
  var BackGraphicURL: java.lang.String
  /** If `TRUE` , the background color value in "BackColor" is not visible. */
  var BackTransparent: scala.Boolean
  /** the text section containing the content of the index */
  var ContentSection: XTextSection
  /**
    * determines if the content of the document index is created from the complete document content or from the current chapter only.
    *
    * It is not available in the bibliography
    */
  var CreateFromChapter: scala.Boolean
  /** the text section containing the header of the index */
  var HeaderSection: XTextSection
  /** determines if the index is protected. */
  var IsProtected: scala.Boolean
  /**
    * returns the interface of the level format of the index.
    *
    * The description of the format of the levels depends on the type of the document index.
    * @see DocumentIndexLevelFormat
    */
  var LevelFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
  /** contains the name of the paragraph style that is applied to the heading. */
  var ParaStyleHeading: java.lang.String
  /** contains the name of the paragraph style that is applied to the 1st level. */
  var ParaStyleLevel1: java.lang.String
  /** contains the name of the paragraph style that is applied to the 10th level. */
  var ParaStyleLevel10: java.lang.String
  /** contains the name of the paragraph style that is applied to the 2nd level. */
  var ParaStyleLevel2: java.lang.String
  /** contains the name of the paragraph style that is applied to the 3rd level. */
  var ParaStyleLevel3: java.lang.String
  /** contains the name of the paragraph style that is applied to the 4th level. */
  var ParaStyleLevel4: java.lang.String
  /** contains the name of the paragraph style that is applied to the 5th level. */
  var ParaStyleLevel5: java.lang.String
  /** contains the name of the paragraph style that is applied to the 6th level. */
  var ParaStyleLevel6: java.lang.String
  /** contains the name of the paragraph style that is applied to the 7th level. */
  var ParaStyleLevel7: java.lang.String
  /** contains the name of the paragraph style that is applied to the 8th level. */
  var ParaStyleLevel8: java.lang.String
  /** contains the name of the paragraph style that is applied to the 9th level. */
  var ParaStyleLevel9: java.lang.String
  /** contains the name of the paragraph style that is applied to the separator level. */
  var ParaStyleSeparator: java.lang.String
  /** contains the column interface. */
  var TextColumns: XTextColumns
  /** contains the title of the index. */
  var Title: java.lang.String
}

