package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionObject extends js.Object {
  
  val DOM: IXMLDOMDocument = js.native
  
  @JSName("InfoPath.SolutionObject_typekey")
  var InfoPathDotSolutionObject_typekey: SolutionObject = js.native
  
  val PackageURL: String = js.native
  
  val URI: String = js.native
  
  val Version: String = js.native
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
  
  @scala.inline
  implicit class SolutionObjectOps[Self <: SolutionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDOM(value: IXMLDOMDocument): Self = this.set("DOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSolutionObject_typekey(value: SolutionObject): Self = this.set("InfoPath.SolutionObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageURL(value: String): Self = this.set("PackageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
