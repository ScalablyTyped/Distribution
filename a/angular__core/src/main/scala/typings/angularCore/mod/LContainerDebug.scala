package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait LContainerDebug extends StObject {
  
  val hasTransplantedViews: Boolean
  
  val host: RElement | RComment | ɵangularPackagesCoreCoreBv
  
  val movedViews: js.Array[ɵangularPackagesCoreCoreBv] | Null
  
  val native: RComment
  
  val next: LViewDebug | LContainerDebug | Null
  
  val parent: LViewDebug | Null
  
  /**
    * Child `LView`s.
    */
  val views: js.Array[LViewDebug]
}
object LContainerDebug {
  
  inline def apply(
    hasTransplantedViews: Boolean,
    host: RElement | RComment | ɵangularPackagesCoreCoreBv,
    native: RComment,
    views: js.Array[LViewDebug]
  ): LContainerDebug = {
    val __obj = js.Dynamic.literal(hasTransplantedViews = hasTransplantedViews.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], movedViews = null, next = null, parent = null)
    __obj.asInstanceOf[LContainerDebug]
  }
  
  extension [Self <: LContainerDebug](x: Self) {
    
    inline def setHasTransplantedViews(value: Boolean): Self = StObject.set(x, "hasTransplantedViews", value.asInstanceOf[js.Any])
    
    inline def setHost(value: RElement | RComment | ɵangularPackagesCoreCoreBv): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setMovedViews(value: js.Array[ɵangularPackagesCoreCoreBv]): Self = StObject.set(x, "movedViews", value.asInstanceOf[js.Any])
    
    inline def setMovedViewsNull: Self = StObject.set(x, "movedViews", null)
    
    inline def setMovedViewsVarargs(value: ɵangularPackagesCoreCoreBv*): Self = StObject.set(x, "movedViews", js.Array(value :_*))
    
    inline def setNative(value: RComment): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setNext(value: LViewDebug | LContainerDebug): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setParent(value: LViewDebug): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setViews(value: js.Array[LViewDebug]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: LViewDebug*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
