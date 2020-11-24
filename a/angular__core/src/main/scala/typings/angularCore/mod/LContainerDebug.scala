package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Human readable version of the `LContainer`
  *
  * `LContainer` is a data structure used internally to keep track of child views. The `LContainer`
  * is designed for efficiency and so at times it is difficult to read or write tests which assert on
  * its values. For this reason when `ngDevMode` is true we patch a `LContainer.debug` property which
  * points to `LContainerDebug` for easier debugging and test writing. It is the intent of
  * `LContainerDebug` to be used in tests.
  */
@js.native
trait LContainerDebug extends js.Object {
  
  val hasTransplantedViews: Boolean = js.native
  
  val host: RElement | RComment | ɵangularPackagesCoreCoreBv = js.native
  
  val movedViews: js.Array[ɵangularPackagesCoreCoreBv] | Null = js.native
  
  val native: RComment = js.native
  
  val next: LViewDebug | LContainerDebug | Null = js.native
  
  val parent: LViewDebug | Null = js.native
  
  /**
    * Child `LView`s.
    */
  val views: js.Array[LViewDebug] = js.native
}
object LContainerDebug {
  
  @scala.inline
  def apply(
    hasTransplantedViews: Boolean,
    host: RElement | RComment | ɵangularPackagesCoreCoreBv,
    native: RComment,
    views: js.Array[LViewDebug]
  ): LContainerDebug = {
    val __obj = js.Dynamic.literal(hasTransplantedViews = hasTransplantedViews.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[LContainerDebug]
  }
  
  @scala.inline
  implicit class LContainerDebugOps[Self <: LContainerDebug] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasTransplantedViews(value: Boolean): Self = this.set("hasTransplantedViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: RElement | RComment | ɵangularPackagesCoreCoreBv): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: RComment): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsVarargs(value: LViewDebug*): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[LViewDebug]): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovedViewsVarargs(value: ɵangularPackagesCoreCoreBv*): Self = this.set("movedViews", js.Array(value :_*))
    
    @scala.inline
    def setMovedViews(value: js.Array[ɵangularPackagesCoreCoreBv]): Self = this.set("movedViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovedViewsNull: Self = this.set("movedViews", null)
    
    @scala.inline
    def setNext(value: LViewDebug | LContainerDebug): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    
    @scala.inline
    def setParent(value: LViewDebug): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
}
