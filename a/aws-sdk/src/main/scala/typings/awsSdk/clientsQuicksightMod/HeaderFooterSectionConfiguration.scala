package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderFooterSectionConfiguration extends StObject {
  
  /**
    * The layout configuration of the header or footer section.
    */
  var Layout: SectionLayoutConfiguration
  
  /**
    * The unique identifier of the header or footer section.
    */
  var SectionId: ShortRestrictiveResourceId
  
  /**
    * The style options of a header or footer section.
    */
  var Style: js.UndefOr[SectionStyle] = js.undefined
}
object HeaderFooterSectionConfiguration {
  
  inline def apply(Layout: SectionLayoutConfiguration, SectionId: ShortRestrictiveResourceId): HeaderFooterSectionConfiguration = {
    val __obj = js.Dynamic.literal(Layout = Layout.asInstanceOf[js.Any], SectionId = SectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooterSectionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeaderFooterSectionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: SectionLayoutConfiguration): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
    
    inline def setSectionId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "SectionId", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: SectionStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "Style", js.undefined)
  }
}
