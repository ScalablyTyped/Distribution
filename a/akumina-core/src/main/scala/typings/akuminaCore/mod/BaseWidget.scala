package typings.akuminaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "BaseWidget")
@js.native
open class BaseWidget () extends StObject {
  
  def BindTemplate(templateUri: String, data: Any, targetDiv: String): Unit = js.native
  
  def GetPropertyValue(requestIn: Any, key: String, defaultValue: Any): Any = js.native
  
  var Properties: Any = js.native
  
  def RefreshWidget(newProps: Any): Unit = js.native
}
