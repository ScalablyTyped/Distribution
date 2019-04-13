package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLClassifier extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: awsDashSdkLib.clientsGlueMod.Classification
  /**
    * The time this classifier was registered.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The time this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the classifier.
    */
  var Name: NameString
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[RowTag] = js.undefined
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.undefined
}

object XMLClassifier {
  @scala.inline
  def apply(
    Classification: Classification,
    Name: NameString,
    CreationTime: Timestamp = null,
    LastUpdated: Timestamp = null,
    RowTag: RowTag = null,
    Version: js.UndefOr[VersionId] = js.undefined
  ): XMLClassifier = {
    val __obj = js.Dynamic.literal(Classification = Classification, Name = Name)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (RowTag != null) __obj.updateDynamic("RowTag")(RowTag)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[XMLClassifier]
  }
}

