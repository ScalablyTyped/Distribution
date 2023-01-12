package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpPackageConfiguration extends StObject {
  
  /**
    * The relative path to the URL for this VOD source. This is combined with SourceLocation::HttpConfiguration::BaseUrl to form a valid URL.
    */
  var Path: _String
  
  /**
    * The name of the source group. This has to match one of the Channel::Outputs::SourceGroup.
    */
  var SourceGroup: _String
  
  /**
    * The streaming protocol for this package configuration. Supported values are HLS and DASH.
    */
  var Type: typings.awsSdk.clientsMediatailorMod.Type
}
object HttpPackageConfiguration {
  
  inline def apply(Path: _String, SourceGroup: _String, Type: Type): HttpPackageConfiguration = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any], SourceGroup = SourceGroup.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpPackageConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpPackageConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPath(value: _String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setSourceGroup(value: _String): Self = StObject.set(x, "SourceGroup", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
