package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that contains hydration-related information serialized
  * on the server, as well as the necessary references to segments of
  * the DOM, to facilitate the hydration process for a given view
  * inside a view container (either an embedded view or a view created
  * for a component).
  */
trait DehydratedContainerView
  extends StObject
     with DehydratedView
object DehydratedContainerView {
  
  inline def apply(): DehydratedContainerView = {
    val __obj = js.Dynamic.literal(firstChild = null)
    __obj.asInstanceOf[DehydratedContainerView]
  }
}
