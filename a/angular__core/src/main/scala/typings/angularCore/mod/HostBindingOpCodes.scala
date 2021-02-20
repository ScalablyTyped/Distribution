package typings.angularCore.mod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores a set of OpCodes to process `HostBindingsFunction` associated with a current view.
  *
  * In order to invoke `HostBindingsFunction` we need:
  * 1. 'elementIdx`: Index to the element associated with the `HostBindingsFunction`.
  * 2. 'directiveIdx`: Index to the directive associated with the `HostBindingsFunction`. (This will
  *    become the context for the `HostBindingsFunction` invocation.)
  * 3. `bindingRootIdx`: Location where the bindings for the `HostBindingsFunction` start. Internally
  *    `HostBindingsFunction` binding indexes start from `0` so we need to add `bindingRootIdx` to
  *    it.
  * 4. `HostBindingsFunction`: A host binding function to execute.
  *
  * The above information needs to be encoded into the `HostBindingOpCodes` in an efficient manner.
  *
  * 1. `elementIdx` is encoded into the `HostBindingOpCodes` as `~elementIdx` (so a negative number);
  * 2. `directiveIdx`
  * 3. `bindingRootIdx`
  * 4. `HostBindingsFunction` is passed in as is.
  *
  * The `HostBindingOpCodes` array contains:
  * - negative number to select the element index.
  * - followed by 1 or more of:
  *    - a number to select the directive index
  *    - a number to select the bindingRoot index
  *    - and a function to invoke.
  *
  * ## Example
  *
  * ```
  * const hostBindingOpCodes = [
  *   ~30,                               // Select element 30
  *   40, 45, MyDir.ɵdir.hostBindings    // Invoke host bindings on MyDir on element 30;
  *                                      // directiveIdx = 40; bindingRootIdx = 45;
  *   50, 55, OtherDir.ɵdir.hostBindings // Invoke host bindings on OtherDire on element 30
  *                                      // directiveIdx = 50; bindingRootIdx = 55;
  * ]
  * ```
  *
  * ## Pseudocode
  * ```
  * const hostBindingOpCodes = tView.hostBindingOpCodes;
  * if (hostBindingOpCodes === null) return;
  * for (let i = 0; i < hostBindingOpCodes.length; i++) {
  *   const opCode = hostBindingOpCodes[i] as number;
  *   if (opCode < 0) {
  *     // Negative numbers are element indexes.
  *     setSelectedIndex(~opCode);
  *   } else {
  *     // Positive numbers are NumberTuple which store bindingRootIndex and directiveIndex.
  *     const directiveIdx = opCode;
  *     const bindingRootIndx = hostBindingOpCodes[++i] as number;
  *     const hostBindingFn = hostBindingOpCodes[++i] as HostBindingsFunction<any>;
  *     setBindingRootForHostBindings(bindingRootIndx, directiveIdx);
  *     const context = lView[directiveIdx];
  *     hostBindingFn(RenderFlags.Update, context);
  *   }
  * }
  * ```
  *
  */
@js.native
trait HostBindingOpCodes
  extends Array[Double | HostBindingsFunction[js.Any]] {
  
  var __brand__ : typings.angularCore.angularCoreStrings.HostBindingOpCodes = js.native
  
  var debug: js.UndefOr[js.Array[String]] = js.native
}
