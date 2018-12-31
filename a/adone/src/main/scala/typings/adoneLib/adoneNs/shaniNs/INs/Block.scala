package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.shani.I.Block")
@js.native
class Block protected () extends js.Object {
  def this(name: java.lang.String, parent: Block, options: DescribeOptions) = this()
  var children: js.Array[Block | Test] = js.native
  var hooks: adoneLib.Anon_After = js.native
  var name: java.lang.String = js.native
  /**
    * Adds a new child into this block
    */
  def addChild(child: Block): scala.Unit = js.native
  def addChild(child: Test): scala.Unit = js.native
  /**
    * After each hooks iterator
    */
  def afterEachHooks(): nodeLib.IterableIterator[Hook] = js.native
  /**
    * After hooks iterator
    */
  def afterHooks(): nodeLib.IterableIterator[Hook] = js.native
  /**
    * Before each hooks iterator
    */
  def beforeEachHooks(): nodeLib.IterableIterator[Hook] = js.native
  /**
    * Before hooks iterator
    */
  def beforeHooks(): nodeLib.IterableIterator[Hook] = js.native
  /**
    * Returns a chain of blocks from the root to this block
    */
  def blockChain(): js.Array[Block] = js.native
  /**
    * Returns a string of names from the root to this block
    */
  def chain(): java.lang.String = js.native
  /**
    * Checks if this block has an inclusive node
    */
  def hasInclusive(): scala.Boolean = js.native
  /**
    * Checks if this block is exclusive (has skip flag)
    */
  def isExclusive(): scala.Boolean = js.native
  /**
    * Checks if this block is inclusive (has only flag)
    */
  def isInclusive(): scala.Boolean = js.native
  /**
    * Returns the block's level, the length of parent blocks chain
    */
  def level(): scala.Double = js.native
  /**
    * Sets the block's level
    */
  def level(level: scala.Double): this.type = js.native
  /**
    * Marks this block as inclusive
    */
  def only(): this.type = js.native
  /**
    * Handles params from options
    */
  def prepare(): js.Promise[scala.Unit] = js.native
  /**
    * Skips this block
    */
  def skip(): this.type = js.native
  /**
    * Returns the timeout of the block
    */
  def timeout(): scala.Double | scala.Null = js.native
  /**
    * Sets a timeout for this block
    */
  def timeout(ms: scala.Double): this.type = js.native
  /**
    * Marks this block as todo
    */
  def todo(): this.type = js.native
}

