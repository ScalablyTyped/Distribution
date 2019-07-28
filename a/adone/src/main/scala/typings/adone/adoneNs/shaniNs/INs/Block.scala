package typings.adone.adoneNs.shaniNs.INs

import typings.adone.Anon_After
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.shani.I.Block")
@js.native
class Block protected () extends js.Object {
  def this(name: String, parent: Block, options: DescribeOptions) = this()
  var children: js.Array[Block | Test] = js.native
  var hooks: Anon_After = js.native
  var name: String = js.native
  /**
    * Adds a new child into this block
    */
  def addChild(child: Block): Unit = js.native
  def addChild(child: Test): Unit = js.native
  /**
    * After each hooks iterator
    */
  def afterEachHooks(): IterableIterator[Hook] = js.native
  /**
    * After hooks iterator
    */
  def afterHooks(): IterableIterator[Hook] = js.native
  /**
    * Before each hooks iterator
    */
  def beforeEachHooks(): IterableIterator[Hook] = js.native
  /**
    * Before hooks iterator
    */
  def beforeHooks(): IterableIterator[Hook] = js.native
  /**
    * Returns a chain of blocks from the root to this block
    */
  def blockChain(): js.Array[Block] = js.native
  /**
    * Returns a string of names from the root to this block
    */
  def chain(): String = js.native
  /**
    * Checks if this block has an inclusive node
    */
  def hasInclusive(): Boolean = js.native
  /**
    * Checks if this block is exclusive (has skip flag)
    */
  def isExclusive(): Boolean = js.native
  /**
    * Checks if this block is inclusive (has only flag)
    */
  def isInclusive(): Boolean = js.native
  /**
    * Returns the block's level, the length of parent blocks chain
    */
  def level(): Double = js.native
  /**
    * Sets the block's level
    */
  def level(level: Double): this.type = js.native
  /**
    * Marks this block as inclusive
    */
  def only(): this.type = js.native
  /**
    * Handles params from options
    */
  def prepare(): js.Promise[Unit] = js.native
  /**
    * Skips this block
    */
  def skip(): this.type = js.native
  /**
    * Returns the timeout of the block
    */
  def timeout(): Double | Null = js.native
  /**
    * Sets a timeout for this block
    */
  def timeout(ms: Double): this.type = js.native
  /**
    * Marks this block as todo
    */
  def todo(): this.type = js.native
}

