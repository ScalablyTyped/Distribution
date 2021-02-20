package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimalShaderDefinition extends StObject {
  
  var schema: Schema_[
    /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
  ] = js.native
}
object MinimalShaderDefinition {
  
  @scala.inline
  def apply(
    schema: Schema_[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
    ]
  ): MinimalShaderDefinition = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimalShaderDefinition]
  }
  
  @scala.inline
  implicit class MinimalShaderDefinitionMutableBuilder[Self <: MinimalShaderDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchema(
      value: Schema_[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ]
    ): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
