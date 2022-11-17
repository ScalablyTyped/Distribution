package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TViewType {
  
  /**
    * `TView` associated with a Component. This would be the `TView` directly associated with the
    * component view (as opposed an `Embedded` `TView` which would be a child of `Component` `TView`)
    */
  inline def Component: 1 = 1.asInstanceOf[1]
  
  /**
    * `TView` associated with a template. Such as `*ngIf`, `<ng-template>` etc... A `Component`
    * can have zero or more `Embedded` `TView`s.
    */
  inline def Embedded: 2 = 2.asInstanceOf[2]
  
  /**
    * Root `TView` is the used to bootstrap components into. It is used in conjunction with
    * `LView` which takes an existing DOM node not owned by Angular and wraps it in `TView`/`LView`
    * so that other components can be loaded into it.
    */
  inline def Root: 0 = 0.asInstanceOf[0]
}
