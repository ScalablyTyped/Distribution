package typings.ajv.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discriminator extends StObject {
  
  var discriminator: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any
  
  var mapping: Record[String, Any]
}
object Discriminator {
  
  inline def apply(
    discriminator: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any,
    mapping: Record[String, Any]
  ): Discriminator = {
    val __obj = js.Dynamic.literal(discriminator = discriminator.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discriminator]
  }
  
  extension [Self <: Discriminator](x: Self) {
    
    inline def setDiscriminator(value: /* import warning: importer.ImportType#apply Failed type conversion: infer M */ js.Any): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: Record[String, Any]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
  }
}
