package typings.akuminaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "BaseWidget")
@js.native
class BaseWidget () extends StObject {
  
  def BindTemplate(templateUri: String, data: js.Any, targetDiv: String): Unit = js.native
  
  def GetPropertyValue(requestIn: js.Any, key: String, defaultValue: js.Any): js.Any = js.native
  
  var Properties: js.Any = js.native
  
  def RefreshWidget(newProps: js.Any): Unit = js.native
}
