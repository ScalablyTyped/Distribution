package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLNamespace extends js.Object {
  @JSName("MSHTML.HTMLNamespace_typekey")
  var MSHTMLDotHTMLNamespace_typekey: HTMLNamespace
  val constructor: js.Any
  val name: String
  var onreadystatechange: js.Any
  val readyState: js.Any
  val tagNames: js.Any
  val urn: String
  def attachEvent(event: String, pdisp: js.Any): Boolean
  def detachEvent(event: String, pdisp: js.Any): Unit
  def doImport(bstrImplementationUrl: String): Unit
}

object HTMLNamespace {
  @scala.inline
  def apply(
    MSHTMLDotHTMLNamespace_typekey: HTMLNamespace,
    attachEvent: (String, js.Any) => Boolean,
    constructor: js.Any,
    detachEvent: (String, js.Any) => Unit,
    doImport: String => Unit,
    name: String,
    onreadystatechange: js.Any,
    readyState: js.Any,
    tagNames: js.Any,
    urn: String
  ): HTMLNamespace = {
    val __obj = js.Dynamic.literal(attachEvent = js.Any.fromFunction2(attachEvent), constructor = constructor.asInstanceOf[js.Any], detachEvent = js.Any.fromFunction2(detachEvent), doImport = js.Any.fromFunction1(doImport), name = name.asInstanceOf[js.Any], onreadystatechange = onreadystatechange.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], tagNames = tagNames.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLNamespace_typekey")(MSHTMLDotHTMLNamespace_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLNamespace]
  }
}

