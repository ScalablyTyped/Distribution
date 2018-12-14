package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/view/query", JSImport.Namespace)
@js.native
object srcViewQueryMod extends js.Object {
  def checkAndUpdateQuery(view: atAngularCoreLib.srcViewTypesMod.ViewData, nodeDef: atAngularCoreLib.srcViewTypesMod.NodeDef): scala.Unit = js.native
  def createQuery(): atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[_] = js.native
  def dirtyParentQueries(view: atAngularCoreLib.srcViewTypesMod.ViewData): scala.Unit = js.native
  def getQueryValue(
    view: atAngularCoreLib.srcViewTypesMod.ViewData,
    nodeDef: atAngularCoreLib.srcViewTypesMod.NodeDef,
    queryValueType: atAngularCoreLib.srcViewTypesMod.QueryValueType
  ): js.Any = js.native
  def queryDef(
    flags: atAngularCoreLib.srcViewTypesMod.NodeFlags,
    id: scala.Double,
    bindings: org.scalablytyped.runtime.StringDictionary[atAngularCoreLib.srcViewTypesMod.QueryBindingType]
  ): atAngularCoreLib.srcViewTypesMod.NodeDef = js.native
}

