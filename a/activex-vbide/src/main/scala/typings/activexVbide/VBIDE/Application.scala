package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application extends StObject {
  
  @JSName("VBIDE.Application_typekey")
  var VBIDEDotApplication_typekey: Application
  
  val Version: String
}
object Application {
  
  @scala.inline
  def apply(VBIDEDotApplication_typekey: Application, Version: String): Application = {
    val __obj = js.Dynamic.literal(Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.Application_typekey")(VBIDEDotApplication_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
  
  @scala.inline
  implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVBIDEDotApplication_typekey(value: Application): Self = StObject.set(x, "VBIDE.Application_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
