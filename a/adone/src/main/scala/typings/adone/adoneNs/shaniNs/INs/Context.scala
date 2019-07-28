package typings.adone.adoneNs.shaniNs.INs

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
  def after(callback: HookCallback): Unit = js.native
  /**
    * Defines a hook that will be called only once after the block's tests
    */
  def after(description: String, callback: HookCallback): Unit = js.native
  /**
    * Defines a hook that will be called after each test
    */
  def afterEach(callback: HookCallback): Unit = js.native
  /**
    * Defines a hook that will be called after each test
    */
  def afterEach(description: String, callback: HookCallback): Unit = js.native
  /**
    * Defines a hook that will be called only once before the block's tests
    */
  def before(callback: HookCallback): Unit = js.native
  /**
    * Defines a hook that will be called only once before the block's tests
    */
  def before(description: String, callback: HookCallback): Unit = js.native
  /**
    * Defines a hook that will be called before each test
    */
  def beforeEach(callback: HookCallback): Unit = js.native
  /**
    * Defines a hook that will be called before each test
    */
  def beforeEach(description: String, callback: HookCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(a: String, args: (String | DescribeCallback)*): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(a: String, b: String, c: String, description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(a: String, b: String, c: String, d: String, description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    i: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    i: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    i: String,
    j: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    i: String,
    j: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(a: String, b: String, description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(a: String, b: String, description: String, options: DescribeOptions, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(a: String, description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(a: String, description: String, options: DescribeOptions, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def context(description: String, options: DescribeOptions, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(a: String, args: (String | DescribeCallback)*): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(a: String, b: String, c: String, description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(a: String, b: String, c: String, d: String, description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    i: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    i: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    i: String,
    j: String,
    description: String,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(
    a: String,
    b: String,
    c: String,
    d: String,
    e: String,
    f: String,
    g: String,
    h: String,
    i: String,
    j: String,
    description: String,
    options: DescribeOptions,
    callback: DescribeCallback
  ): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(a: String, b: String, description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(a: String, b: String, description: String, options: DescribeOptions, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(a: String, description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(a: String, description: String, options: DescribeOptions, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(description: String, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a tests block
    */
  def describe(description: String, options: DescribeOptions, callback: DescribeCallback): Unit = js.native
  /**
    * Defines a test
    */
  def it(description: String, callback: TestCallback): Unit = js.native
  /**
    * Defines a test
    */
  def it(description: String, options: TestOptions, callback: TestCallback): Unit = js.native
  /**
    * Defines a test
    */
  def specify(description: String, callback: TestCallback): Unit = js.native
  /**
    * Defines a test
    */
  def specify(description: String, options: TestOptions, callback: TestCallback): Unit = js.native
  /**
    * Starts testing
    */
  def start(): Emitter = js.native
}

