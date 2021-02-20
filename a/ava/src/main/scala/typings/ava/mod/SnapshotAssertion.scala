package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotAssertion extends StObject {
  
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  def apply(expected: js.Any): Unit = js.native
  def apply(expected: js.Any, message: String): Unit = js.native
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details) (selected
  	 * through `options.id` if provided), or if necessary record a new snapshot.
  	 */
  def apply(expected: js.Any, options: SnapshotOptions): Unit = js.native
  def apply(expected: js.Any, options: SnapshotOptions, message: String): Unit = js.native
  
  /** Skip this assertion. */
  def skip(expected: js.Any): Unit = js.native
  def skip(expected: js.Any, message: String): Unit = js.native
  /** Skip this assertion. */
  def skip(expected: js.Any, options: SnapshotOptions): Unit = js.native
  def skip(expected: js.Any, options: SnapshotOptions, message: String): Unit = js.native
}
