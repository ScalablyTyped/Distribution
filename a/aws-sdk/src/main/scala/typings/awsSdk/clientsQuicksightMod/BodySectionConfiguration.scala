package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodySectionConfiguration extends StObject {
  
  /**
    * The configuration of content in a body section.
    */
  var Content: BodySectionContent
  
  /**
    * The configuration of a page break for a section.
    */
  var PageBreakConfiguration: js.UndefOr[SectionPageBreakConfiguration] = js.undefined
  
  /**
    * The unique identifier of a body section.
    */
  var SectionId: ShortRestrictiveResourceId
  
  /**
    * The style options of a body section.
    */
  var Style: js.UndefOr[SectionStyle] = js.undefined
}
object BodySectionConfiguration {
  
  inline def apply(Content: BodySectionContent, SectionId: ShortRestrictiveResourceId): BodySectionConfiguration = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], SectionId = SectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodySectionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodySectionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContent(value: BodySectionContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setPageBreakConfiguration(value: SectionPageBreakConfiguration): Self = StObject.set(x, "PageBreakConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPageBreakConfigurationUndefined: Self = StObject.set(x, "PageBreakConfiguration", js.undefined)
    
    inline def setSectionId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "SectionId", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: SectionStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "Style", js.undefined)
  }
}
