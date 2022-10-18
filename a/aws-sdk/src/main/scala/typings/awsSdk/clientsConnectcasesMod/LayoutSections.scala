package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutSections extends StObject {
  
  var sections: js.UndefOr[SectionsList] = js.undefined
}
object LayoutSections {
  
  inline def apply(): LayoutSections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutSections]
  }
  
  extension [Self <: LayoutSections](x: Self) {
    
    inline def setSections(value: SectionsList): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: Section*): Self = StObject.set(x, "sections", js.Array(value*))
  }
}
