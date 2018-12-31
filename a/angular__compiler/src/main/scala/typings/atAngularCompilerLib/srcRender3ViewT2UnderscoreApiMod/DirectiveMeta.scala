package typings
package atAngularCompilerLib.srcRender3ViewT2UnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectiveMeta extends js.Object {
  /**
    * Name under which the directive is exported, if any (exportAs in Angular).
    *
    * Null otherwise
    */
  var exportAs: java.lang.String | scala.Null
  /**
    * Set of inputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]
  /**
    * Whether the directive is a component.
    */
  var isComponent: scala.Boolean
  /**
    * Name of the directive class (used for debugging).
    */
  var name: java.lang.String
  /**
    * Set of outputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var outputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

