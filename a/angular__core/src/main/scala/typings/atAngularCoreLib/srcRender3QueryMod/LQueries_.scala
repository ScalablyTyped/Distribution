package typings
package atAngularCoreLib.srcRender3QueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/query", "LQueries_")
@js.native
class `LQueries_` ()
  extends atAngularCoreLib.srcRender3InterfacesQueryMod.LQueries {
  def this(parent: `LQueries_`) = this()
  def this(parent: `LQueries_`, shallow: LQuery[_]) = this()
  def this(parent: scala.Null, shallow: LQuery[_]) = this()
  def this(parent: `LQueries_`, shallow: LQuery[_], deep: LQuery[_]) = this()
  def this(parent: `LQueries_`, shallow: scala.Null, deep: LQuery[_]) = this()
  def this(parent: scala.Null, shallow: LQuery[_], deep: LQuery[_]) = this()
  def this(parent: scala.Null, shallow: scala.Null, deep: LQuery[_]) = this()
  var deep: js.Any = js.native
  @JSName("parent")
  var `parent_LQueries_`: `LQueries_` | scala.Null = js.native
  var shallow: js.Any = js.native
  def track[T](
    queryList: atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[T],
    predicate: atAngularCoreLib.srcTypeMod.Type[T]
  ): scala.Unit = js.native
  def track[T](
    queryList: atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[T],
    predicate: atAngularCoreLib.srcTypeMod.Type[T],
    descend: scala.Boolean
  ): scala.Unit = js.native
  def track[T](
    queryList: atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[T],
    predicate: atAngularCoreLib.srcTypeMod.Type[T],
    descend: scala.Boolean,
    read: atAngularCoreLib.srcTypeMod.Type[T]
  ): scala.Unit = js.native
  def track[T](
    queryList: atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[T],
    predicate: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def track[T](
    queryList: atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[T],
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean
  ): scala.Unit = js.native
  def track[T](
    queryList: atAngularCoreLib.srcLinkerQueryUnderscoreListMod.QueryList[T],
    predicate: js.Array[java.lang.String],
    descend: scala.Boolean,
    read: atAngularCoreLib.srcTypeMod.Type[T]
  ): scala.Unit = js.native
}

