package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableFieldLinkConfiguration extends StObject {
  
  /**
    * The URL content (text, icon) for the table link configuration.
    */
  var Content: TableFieldLinkContentConfiguration
  
  /**
    * The URL target (new tab, new window, same tab) for the table link configuration.
    */
  var Target: URLTargetConfiguration
}
object TableFieldLinkConfiguration {
  
  inline def apply(Content: TableFieldLinkContentConfiguration, Target: URLTargetConfiguration): TableFieldLinkConfiguration = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFieldLinkConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableFieldLinkConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContent(value: TableFieldLinkContentConfiguration): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: URLTargetConfiguration): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
