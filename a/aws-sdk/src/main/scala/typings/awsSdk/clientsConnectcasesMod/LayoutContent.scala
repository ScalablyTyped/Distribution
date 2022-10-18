package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutContent extends StObject {
  
  /**
    * Content specific to BasicLayout type. It configures fields in the top panel and More Info tab of Cases user interface.
    */
  var basic: js.UndefOr[BasicLayout] = js.undefined
}
object LayoutContent {
  
  inline def apply(): LayoutContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutContent]
  }
  
  extension [Self <: LayoutContent](x: Self) {
    
    inline def setBasic(value: BasicLayout): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
  }
}
