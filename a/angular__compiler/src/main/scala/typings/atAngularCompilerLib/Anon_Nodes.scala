package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Nodes extends js.Object {
  /**
           * Whether the template includes <ng-content> tags.
           */
  var hasNgContent: scala.Boolean
  /**
           * Selectors found in the <ng-content> tags in the template.
           */
  var ngContentSelectors: js.Array[java.lang.String]
  /**
           * Parsed nodes of the template.
           */
  var nodes: js.Array[atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node]
  /**
           * Path to the .ts file in which this template's generated code will be included, relative to
           * the compilation root. This will be used to generate identifiers that need to be globally
           * unique in certain contexts (such as g3).
           */
  var relativeContextFilePath: java.lang.String
}

