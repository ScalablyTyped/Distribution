package typings.angularCore.mod

import typings.angularCore.angularCoreNumbers.`0`
import typings.angularCore.angularCoreNumbers.`1`
import typings.angularCore.angularCoreNumbers.`2`
import typings.angularCore.angularCoreNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of flags to be used with Queries.
  *
  * NOTE: Ensure changes here are reflected in `packages/compiler/src/render3/view/compiler.ts`
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreNumbers.`0`
  - typings.angularCore.angularCoreNumbers.`1`
  - typings.angularCore.angularCoreNumbers.`2`
  - typings.angularCore.angularCoreNumbers.`4`
*/
trait QueryFlags extends StObject
object QueryFlags {
  
  /**
    * Whether or not the query should descend into children.
    */
  inline def descendants: `1` = 1.asInstanceOf[`1`]
  
  /**
    * If the `QueryList` should fire change event only if actual change to query was computed (vs old
    * behavior where the change was fired whenever the query was recomputed, even if the recomputed
    * query resulted in the same list.)
    */
  inline def emitDistinctChangesOnly: `4` = 4.asInstanceOf[`4`]
  
  /**
    * The query can be computed statically and hence can be assigned eagerly.
    *
    * NOTE: Backwards compatibility with ViewEngine.
    */
  inline def isStatic: `2` = 2.asInstanceOf[`2`]
  
  /**
    * No flags
    */
  inline def none: `0` = 0.asInstanceOf[`0`]
}
