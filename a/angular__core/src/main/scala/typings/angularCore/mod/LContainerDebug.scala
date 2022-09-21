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
  
  val host: RElement | RComment | LView[Any]
  
  val movedViews: js.Array[LView[Any]] | Null
  
  val native: RComment
  
  val next: LViewDebug[Any] | LContainerDebug | Null
  
  val parent: LViewDebug[Any] | Null
  
  /**
    * Child `LView`s.
    */
  val views: js.Array[LViewDebug[Any]]
}
object LContainerDebug {
  
  inline def apply(
    hasTransplantedViews: Boolean,
    host: RElement | RComment | LView[Any],
    native: RComment,
    views: js.Array[LViewDebug[Any]]
  ): LContainerDebug = {
    val __obj = js.Dynamic.literal(hasTransplantedViews = hasTransplantedViews.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], movedViews = null, next = null, parent = null)
    __obj.asInstanceOf[LContainerDebug]
  }
  
  extension [Self <: LContainerDebug](x: Self) {
    
    inline def setHasTransplantedViews(value: Boolean): Self = StObject.set(x, "hasTransplantedViews", value.asInstanceOf[js.Any])
    
    inline def setHost(value: RElement | RComment | LView[Any]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setMovedViews(value: js.Array[LView[Any]]): Self = StObject.set(x, "movedViews", value.asInstanceOf[js.Any])
    
    inline def setMovedViewsNull: Self = StObject.set(x, "movedViews", null)
    
    inline def setMovedViewsVarargs(value: LView[Any]*): Self = StObject.set(x, "movedViews", js.Array(value*))
    
    inline def setNative(value: RComment): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setNext(value: LViewDebug[Any] | LContainerDebug): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setParent(value: LViewDebug[Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setViews(value: js.Array[LViewDebug[Any]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: LViewDebug[Any]*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
