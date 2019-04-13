package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotAssertion extends js.Object {
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  def apply(expected: js.Any): scala.Unit = js.native
  def apply(expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details) (selected
  	 * through `options.id` if provided), or if necessary record a new snapshot.
  	 */
  def apply(expected: js.Any, options: SnapshotOptions): scala.Unit = js.native
  def apply(expected: js.Any, options: SnapshotOptions, message: java.lang.String): scala.Unit = js.native
  /** Skip this assertion. */
  def skip(expected: js.Any): scala.Unit = js.native
  def skip(expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /** Skip this assertion. */
  def skip(expected: js.Any, options: SnapshotOptions): scala.Unit = js.native
  def skip(expected: js.Any, options: SnapshotOptions, message: java.lang.String): scala.Unit = js.native
}

