package typings.angularCore.mod

import typings.angularCore.angularCoreInts.`12`
import typings.angularCore.angularCoreInts.`16`
import typings.angularCore.angularCoreInts.`1`
import typings.angularCore.angularCoreInts.`2`
import typings.angularCore.angularCoreInts.`32`
import typings.angularCore.angularCoreInts.`3`
import typings.angularCore.angularCoreInts.`4`
import typings.angularCore.angularCoreInts.`64`
import typings.angularCore.angularCoreInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TNodeType corresponds to the {@link TNode} `type` property.
  *
  * NOTE: type IDs are such that we use each bit to denote a type. This is done so that we can easily
  * check if the `TNode` is of more than one type.
  *
  * `if (tNode.type === TNodeType.Text || tNode.type === TNode.Element)`
  * can be written as:
  * `if (tNode.type & (TNodeType.Text | TNodeType.Element))`
  *
  * However any given `TNode` can only be of one type.
  */
/* Rewritten from type alias, can be one of: 
  - typings.angularCore.angularCoreInts.`1`
  - typings.angularCore.angularCoreInts.`2`
  - typings.angularCore.angularCoreInts.`4`
  - typings.angularCore.angularCoreInts.`8`
  - typings.angularCore.angularCoreInts.`16`
  - typings.angularCore.angularCoreInts.`32`
  - typings.angularCore.angularCoreInts.`64`
  - typings.angularCore.angularCoreInts.`3`
  - typings.angularCore.angularCoreInts.`12`
*/
trait TNodeType extends StObject
object TNodeType {
  
  inline def AnyContainer: `12` = 12.asInstanceOf[`12`]
  
  inline def AnyRNode: `3` = 3.asInstanceOf[`3`]
  
  /**
    * The TNode contains information about an {@link LContainer} for embedded views.
    */
  inline def Container: `4` = 4.asInstanceOf[`4`]
  
  /**
    * The TNode contains information about a DOM element aka {@link RElement}.
    */
  inline def Element: `2` = 2.asInstanceOf[`2`]
  
  /**
    * The TNode contains information about an `<ng-container>` element {@link RNode}.
    */
  inline def ElementContainer: `8` = 8.asInstanceOf[`8`]
  
  /**
    * The TNode contains information about an ICU comment used in `i18n`.
    */
  inline def Icu: `32` = 32.asInstanceOf[`32`]
  
  /**
    * Special node type representing a placeholder for future `TNode` at this location.
    *
    * I18n translation blocks are created before the element nodes which they contain. (I18n blocks
    * can span over many elements.) Because i18n `TNode`s (representing text) are created first they
    * often may need to point to element `TNode`s which are not yet created. In such a case we create
    * a `Placeholder` `TNode`. This allows the i18n to structurally link the `TNode`s together
    * without knowing any information about the future nodes which will be at that location.
    *
    * On `firstCreatePass` When element instruction executes it will try to create a `TNode` at that
    * location. Seeing a `Placeholder` `TNode` already there tells the system that it should reuse
    * existing `TNode` (rather than create a new one) and just update the missing information.
    */
  inline def Placeholder: `64` = 64.asInstanceOf[`64`]
  
  /**
    * The TNode contains information about an `<ng-content>` projection
    */
  inline def Projection: `16` = 16.asInstanceOf[`16`]
  
  /**
    * The TNode contains information about a DOM element aka {@link RText}.
    */
  inline def Text: `1` = 1.asInstanceOf[`1`]
}
