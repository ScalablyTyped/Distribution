package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateXMLClassifierRequest extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: awsDashSdkLib.clientsGlueMod.Classification
  /**
    * The name of the classifier.
    */
  var Name: NameString
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. Note that this cannot identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[RowTag] = js.undefined
}

object CreateXMLClassifierRequest {
  @scala.inline
  def apply(Classification: Classification, Name: NameString, RowTag: RowTag = null): CreateXMLClassifierRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification, Name = Name)
    if (RowTag != null) __obj.updateDynamic("RowTag")(RowTag)
    __obj.asInstanceOf[CreateXMLClassifierRequest]
  }
}

