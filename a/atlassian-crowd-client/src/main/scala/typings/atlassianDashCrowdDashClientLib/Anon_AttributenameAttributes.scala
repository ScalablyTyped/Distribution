package typings
package atlassianDashCrowdDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributenameAttributes extends js.Object {
  def list(groupname: java.lang.String): js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
  def remove(groupname: java.lang.String, attributename: java.lang.String): js.Promise[scala.Unit]
  def set(
    groupname: java.lang.String,
    attributes: atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced
  ): js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
}

object Anon_AttributenameAttributes {
  @scala.inline
  def apply(
    list: java.lang.String => js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced],
    remove: (java.lang.String, java.lang.String) => js.Promise[scala.Unit],
    set: (java.lang.String, atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced) => js.Promise[atlassianDashCrowdDashClientLib.libModelsAttributesMod.namespaced]
  ): Anon_AttributenameAttributes = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[Anon_AttributenameAttributes]
  }
}

