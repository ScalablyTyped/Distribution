package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateXMLClassifierRequest extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: typings.awsDashSdk.clientsGlueMod.Classification = js.native
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This can't identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[typings.awsDashSdk.clientsGlueMod.RowTag] = js.native
}

object CreateXMLClassifierRequest {
  @scala.inline
  def apply(Classification: Classification, Name: NameString, RowTag: RowTag = null): CreateXMLClassifierRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (RowTag != null) __obj.updateDynamic("RowTag")(RowTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateXMLClassifierRequest]
  }
}

