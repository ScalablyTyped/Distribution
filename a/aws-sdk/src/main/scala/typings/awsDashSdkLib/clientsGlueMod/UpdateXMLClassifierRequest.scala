package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateXMLClassifierRequest extends js.Object {
  /**
    * An identifier of the data format that the classifier matches.
    */
  var Classification: js.UndefOr[Classification] = js.undefined
  /**
    * The name of the classifier.
    */
  var Name: NameString
  /**
    * The XML tag designating the element that contains each record in an XML document being parsed. This cannot identify a self-closing element (closed by /&gt;). An empty row element that contains only attributes can be parsed as long as it ends with a closing tag (for example, &lt;row item_a="A" item_b="B"&gt;&lt;/row&gt; is okay, but &lt;row item_a="A" item_b="B" /&gt; is not).
    */
  var RowTag: js.UndefOr[RowTag] = js.undefined
}

object UpdateXMLClassifierRequest {
  @scala.inline
  def apply(Name: NameString, Classification: Classification = null, RowTag: RowTag = null): UpdateXMLClassifierRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Classification != null) __obj.updateDynamic("Classification")(Classification)
    if (RowTag != null) __obj.updateDynamic("RowTag")(RowTag)
    __obj.asInstanceOf[UpdateXMLClassifierRequest]
  }
}

