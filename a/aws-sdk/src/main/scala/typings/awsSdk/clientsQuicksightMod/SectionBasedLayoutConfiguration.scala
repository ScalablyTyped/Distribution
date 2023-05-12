package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionBasedLayoutConfiguration extends StObject {
  
  /**
    * A list of body section configurations.
    */
  var BodySections: BodySectionConfigurationList
  
  /**
    * The options for the canvas of a section-based layout.
    */
  var CanvasSizeOptions: SectionBasedLayoutCanvasSizeOptions
  
  /**
    * A list of footer section configurations.
    */
  var FooterSections: HeaderFooterSectionConfigurationList
  
  /**
    * A list of header section configurations.
    */
  var HeaderSections: HeaderFooterSectionConfigurationList
}
object SectionBasedLayoutConfiguration {
  
  inline def apply(
    BodySections: BodySectionConfigurationList,
    CanvasSizeOptions: SectionBasedLayoutCanvasSizeOptions,
    FooterSections: HeaderFooterSectionConfigurationList,
    HeaderSections: HeaderFooterSectionConfigurationList
  ): SectionBasedLayoutConfiguration = {
    val __obj = js.Dynamic.literal(BodySections = BodySections.asInstanceOf[js.Any], CanvasSizeOptions = CanvasSizeOptions.asInstanceOf[js.Any], FooterSections = FooterSections.asInstanceOf[js.Any], HeaderSections = HeaderSections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionBasedLayoutConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SectionBasedLayoutConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBodySections(value: BodySectionConfigurationList): Self = StObject.set(x, "BodySections", value.asInstanceOf[js.Any])
    
    inline def setBodySectionsVarargs(value: BodySectionConfiguration*): Self = StObject.set(x, "BodySections", js.Array(value*))
    
    inline def setCanvasSizeOptions(value: SectionBasedLayoutCanvasSizeOptions): Self = StObject.set(x, "CanvasSizeOptions", value.asInstanceOf[js.Any])
    
    inline def setFooterSections(value: HeaderFooterSectionConfigurationList): Self = StObject.set(x, "FooterSections", value.asInstanceOf[js.Any])
    
    inline def setFooterSectionsVarargs(value: HeaderFooterSectionConfiguration*): Self = StObject.set(x, "FooterSections", js.Array(value*))
    
    inline def setHeaderSections(value: HeaderFooterSectionConfigurationList): Self = StObject.set(x, "HeaderSections", value.asInstanceOf[js.Any])
    
    inline def setHeaderSectionsVarargs(value: HeaderFooterSectionConfiguration*): Self = StObject.set(x, "HeaderSections", js.Array(value*))
  }
}
