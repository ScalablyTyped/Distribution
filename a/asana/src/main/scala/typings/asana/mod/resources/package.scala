package typings.asana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object resources {
  
  @scala.inline
  def Resource: typings.asana.mod.resources.ResourceStatic = typings.asana.mod.resources.^.asInstanceOf[js.Dynamic].selectDynamic("Resource").asInstanceOf[typings.asana.mod.resources.ResourceStatic]
  @scala.inline
  def Resource_=(x: typings.asana.mod.resources.ResourceStatic): scala.Unit = typings.asana.mod.resources.^.asInstanceOf[js.Dynamic].updateDynamic("Resource")(x.asInstanceOf[js.Any])
  
  type SimpleResourceList = typings.asana.mod.resources.ResourceList[typings.asana.mod.resources.Resource]
}
