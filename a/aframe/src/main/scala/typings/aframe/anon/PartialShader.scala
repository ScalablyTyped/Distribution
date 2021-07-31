package typings.aframe.anon

import typings.aframe.mod.Schema_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<aframe.aframe.Shader> */
trait PartialShader extends StObject {
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var fragmentShader: js.UndefOr[String] = js.undefined
  
  var init: js.UndefOr[
    js.Function1[
      /* data */ js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
      ], 
      Unit
    ]
  ] = js.undefined
  
  var material: js.UndefOr[typings.three.mod.Material] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[
    Schema_[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
    ]
  ] = js.undefined
  
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.undefined
  
  var update: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any, 
      Unit
    ]
  ] = js.undefined
  
  var vertexShader: js.UndefOr[String] = js.undefined
}
object PartialShader {
  
  @scala.inline
  def apply(): PartialShader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShader]
  }
  
  @scala.inline
  implicit class PartialShaderMutableBuilder[Self <: PartialShader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFragmentShader(value: String): Self = StObject.set(x, "fragmentShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentShaderUndefined: Self = StObject.set(x, "fragmentShader", js.undefined)
    
    @scala.inline
    def setInit(
      value: /* data */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ] => Unit
    ): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setMaterial(value: typings.three.mod.Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSchema(
      value: Schema_[
          /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
        ]
    ): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setTick(value: (/* time */ Double, /* timeDelta */ Double) => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    @scala.inline
    def setUpdate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ /* oldData */ js.Any => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    @scala.inline
    def setVertexShader(value: String): Self = StObject.set(x, "vertexShader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexShaderUndefined: Self = StObject.set(x, "vertexShader", js.undefined)
  }
}
