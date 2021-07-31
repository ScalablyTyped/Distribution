package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerProperties
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[String]] {
  
  var copyright: js.UndefOr[String] = js.undefined
  
  var host: String
  
  var information: String
  
  var platform: String
  
  var product: String
  
  var version: String
}
object ServerProperties {
  
  @scala.inline
  def apply(host: String, information: String, platform: String, product: String, version: String): ServerProperties = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerProperties]
  }
  
  @scala.inline
  implicit class ServerPropertiesMutableBuilder[Self <: ServerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformation(value: String): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
