package typings.antDesignReactSlick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ComponentConstructor[TProps] = (typings.react.mod.ComponentClass[TProps, typings.react.mod.ComponentState]) | typings.react.mod.StatelessComponent[TProps]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignReactSlick.antDesignReactSlickStrings.left
    - typings.antDesignReactSlick.antDesignReactSlickStrings.down
    - typings.antDesignReactSlick.antDesignReactSlickStrings.right
    - typings.antDesignReactSlick.antDesignReactSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = typings.antDesignReactSlick.mod._SwipeDirection | java.lang.String
}
