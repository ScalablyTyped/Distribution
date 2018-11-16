package typings
package avoscloudDashSdkLib.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creates a new AV AV.Query for the given AV.Object subclass.
     * @param objectClass -
     *   An instance of a subclass of AV.Object, or a AV className string.
     * @class
     *
     * <p>AV.Query defines a query that is used to fetch AV.Objects. The
     * most common use case is finding all objects that match a query through the
     * <code>find</code> method. For example, this sample code fetches all objects
     * of class <code>MyClass</code>. It calls a different function depending on
     * whether the fetch succeeded or not.
     *
     * <pre>
     * var query = new AV.Query(MyClass);
     * query.find({
     *   success: function(results) {
     *     // results is an array of AV.Object.
     *   },
     *
     *   error: function(error) {
     *     // error is an instance of AV.Error.
     *   }
     * });</pre></p>
     *
     * <p>A AV.Query can also be used to retrieve a single object whose id is
     * known, through the get method. For example, this sample code fetches an
     * object of class <code>MyClass</code> and id <code>myId</code>. It calls a
     * different function depending on whether the fetch succeeded or not.
     *
     * <pre>
     * var query = new AV.Query(MyClass);
     * query.get(myId, {
     *   success: function(object) {
     *     // object is an instance of AV.Object.
     *   },
     *
     *   error: function(object, error) {
     *     // error is an instance of AV.Error.
     *   }
     * });</pre></p>
     *
     * <p>A AV.Query can also be used to count the number of objects that match
     * the query without retrieving all of those objects. For example, this
     * sample code counts the number of objects of the class <code>MyClass</code>
     * <pre>
     * var query = new AV.Query(MyClass);
     * query.count({
     *   success: function(number) {
     *     // There are number instances of MyClass.
     *   },
     *
     *   error: function(error) {
     *     // error is an instance of AV.Error.
     *   }
     * });</pre></p>
     */
@JSImport("leanengine", "Query")
@js.native
class Query protected ()
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.Query {
  def this(objectClass: js.Any) = this()
}

/**
     * Creates a new AV AV.Query for the given AV.Object subclass.
     * @param objectClass -
     *   An instance of a subclass of AV.Object, or a AV className string.
     * @class
     *
     * <p>AV.Query defines a query that is used to fetch AV.Objects. The
     * most common use case is finding all objects that match a query through the
     * <code>find</code> method. For example, this sample code fetches all objects
     * of class <code>MyClass</code>. It calls a different function depending on
     * whether the fetch succeeded or not.
     *
     * <pre>
     * var query = new AV.Query(MyClass);
     * query.find({
     *   success: function(results) {
     *     // results is an array of AV.Object.
     *   },
     *
     *   error: function(error) {
     *     // error is an instance of AV.Error.
     *   }
     * });</pre></p>
     *
     * <p>A AV.Query can also be used to retrieve a single object whose id is
     * known, through the get method. For example, this sample code fetches an
     * object of class <code>MyClass</code> and id <code>myId</code>. It calls a
     * different function depending on whether the fetch succeeded or not.
     *
     * <pre>
     * var query = new AV.Query(MyClass);
     * query.get(myId, {
     *   success: function(object) {
     *     // object is an instance of AV.Object.
     *   },
     *
     *   error: function(object, error) {
     *     // error is an instance of AV.Error.
     *   }
     * });</pre></p>
     *
     * <p>A AV.Query can also be used to count the number of objects that match
     * the query without retrieving all of those objects. For example, this
     * sample code counts the number of objects of the class <code>MyClass</code>
     * <pre>
     * var query = new AV.Query(MyClass);
     * query.count({
     *   success: function(number) {
     *     // There are number instances of MyClass.
     *   },
     *
     *   error: function(error) {
     *     // error is an instance of AV.Error.
     *   }
     * });</pre></p>
     */
@JSImport("leanengine", "Query")
@js.native
object Query extends js.Object {
  def and(var_args: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Query*): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Query = js.native
  def or(var_args: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Query*): avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Query = js.native
}

