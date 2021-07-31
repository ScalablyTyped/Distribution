package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionObject extends StObject {
  
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
  
  @scala.inline
  implicit class SolutionObjectMutableBuilder[Self <: SolutionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDOM(value: IXMLDOMDocument): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSolutionObject_typekey(value: SolutionObject): Self = StObject.set(x, "InfoPath.SolutionObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageURL(value: String): Self = StObject.set(x, "PackageURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
