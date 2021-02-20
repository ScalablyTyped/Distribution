package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.`array-map`
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `KeyValueArray` is an array where even positions contain keys and odd positions contain values.
  *
  * `KeyValueArray` provides a very efficient way of iterating over its contents. For small
  * sets (~10) the cost of binary searching an `KeyValueArray` has about the same performance
  * characteristics that of a `Map` with significantly better memory footprint.
  *
  * If used as a `Map` the keys are stored in alphabetical order so that they can be binary searched
  * for retrieval.
  *
  * See: `keyValueArraySet`, `keyValueArrayGet`, `keyValueArrayIndexOf`, `keyValueArrayDelete`.
  */
@js.native
trait KeyValueArray[VALUE] extends Array[VALUE | String] {
  
  var __brand__ : `array-map` = js.native
}
