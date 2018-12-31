package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /**
    * Defines a hook that will be called after each test
    */
  @JSName("afterEach")
  var afterEach_Original: HookFunction = js.native
  /**
    * Defines a hook that will be called only once after the block's tests
    */
  @JSName("after")
  var after_Original: HookFunction = js.native
  /**
    * Defines a hook that will be called before each test
    */
  @JSName("beforeEach")
  var beforeEach_Original: HookFunction = js.native
  /**
    * Defines a hook that will be called only once before the block's tests
    */
  @JSName("before")
  var before_Original: HookFunction = js.native
  /**
    * Defines a tests block
    */
  @JSName("context")
  var context_Original: DescribeFunction = js.native
  /**
    * Defines a tests block
    */
  @JSName("describe")
  var describe_Original: DescribeFunction = js.native
  /**
    * Defines a test
    */
  @JSName("it")
  var it_Original: TestFunction = js.native
  /**
    * Root node
    */
  var root: Block = js.native
  /**
    * Defines a test
    */
  @JSName("specify")
  var specify_Original: TestFunction = js.native
  /**
    * Defines a hook that will be called only once after the block's tests
    */
  def after(callback: HookCallback): scala.Unit = js.native
  /**
    * Defines a hook that will be called only once after the block's tests
    */
  def after(description: java.lang.String, callback: HookCallback): scala.Unit = js.native
  /**
    * Defines a hook that will be called after each test
    */
  def afterEach(callback: HookCallback): scala.Unit = js.native
  /**
    * Defines a hook that will be called after each test
    */
  def afterEach(description: java.lang.String, callback: HookCallback): scala.Unit = js.native
  /**
    * Defines a hook that will be called only once before the block's tests
    */
  def before(callback: HookCallback): scala.Unit = js.native
  /**
    * Defines a hook that will be called only once before the block's tests
    */
  def before(description: java.lang.String, callback: HookCallback): scala.Unit = js.native
  /**
    * Defines a hook that will be called before each test
    */
  def beforeEach(callback: HookCallback): scala.Unit = js.native
  /**
    * Defines a hook that will be called before each test
    */
  def beforeEach(description: java.lang.String, callback: HookCallback): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(a: java.lang.String, args: (java.lang.String | DescribeCallback)*): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    i: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    i: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    i: java.lang.String,
    j: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    i: java.lang.String,
    j: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    b: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(a: java.lang.String, description: java.lang.String, callback: DescribeCallback): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(description: java.lang.String, callback: DescribeCallback): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def context(description: java.lang.String, options: DescribeOptions, callback: DescribeCallback): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(a: java.lang.String, args: (java.lang.String | DescribeCallback)*): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    i: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    i: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    i: java.lang.String,
    j: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    c: java.lang.String,
    d: java.lang.String,
    e: java.lang.String,
    f: java.lang.String,
    g: java.lang.String,
    h: java.lang.String,
    i: java.lang.String,
    j: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    description: java.lang.String,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    b: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(a: java.lang.String, description: java.lang.String, callback: DescribeCallback): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: java.lang.String,
    description: java.lang.String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(description: java.lang.String, callback: DescribeCallback): scala.Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(description: java.lang.String, options: DescribeOptions, callback: DescribeCallback): scala.Unit = js.native
  /**
    * Defines a test
    */
  def it(description: java.lang.String, callback: TestCallback): scala.Unit = js.native
  /**
    * Defines a test
    */
  def it(description: java.lang.String, options: TestOptions, callback: TestCallback): scala.Unit = js.native
  /**
    * Defines a test
    */
  def specify(description: java.lang.String, callback: TestCallback): scala.Unit = js.native
  /**
    * Defines a test
    */
  def specify(description: java.lang.String, options: TestOptions, callback: TestCallback): scala.Unit = js.native
  /**
    * Starts testing
    */
  def start(): Emitter = js.native
}

