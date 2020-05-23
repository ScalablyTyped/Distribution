package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolutionObject extends js.Object {
  val DOM: IXMLDOMDocument
  @JSName("InfoPath.SolutionObject_typekey")
  var InfoPathDotSolutionObject_typekey: SolutionObject
  val PackageURL: String
  val URI: String
  val Version: String
}

object SolutionObject {
  @scala.inline
  def apply(
    DOM: IXMLDOMDocument,
    InfoPathDotSolutionObject_typekey: SolutionObject,
    PackageURL: String,
    URI: String,
    Version: String
  ): SolutionObject = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], PackageURL = PackageURL.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SolutionObject_typekey")(InfoPathDotSolutionObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SolutionObject]
  }
}

