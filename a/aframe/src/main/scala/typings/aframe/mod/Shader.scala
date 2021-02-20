package typings.aframe.mod

import typings.three.mod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shader extends StObject {
  
  var data: js.Object = js.native
  
  var fragmentShader: String = js.native
  
  def init(): Unit = js.native
  @JSName("init")
  def init_data(data: /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any): Unit = js.native
  
  var material: Material = js.native
  
  var name: String = js.native
  
  var schema: Schema_[
    /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
  ] = js.native
  
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.native
  
  @JSName("update")
  def update_data(
    oldData: /* import warning: importer.ImportType#apply Failed type conversion: this['data'] */ js.Any
  ): Unit = js.native
  
  var vertexShader: String = js.native
}
