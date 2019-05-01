package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object astDashTypesMod {
  type Main = (astDashTypesLib.typesMod.Omit[
    stdLib.ReturnType[
      js.Function1[
        /* defs */ js.Array[astDashTypesLib.typesMod.Def], 
        astDashTypesLib.Anon_AstNodesAreEquivalent
      ]
    ], 
    java.lang.String
  ]) with GenTypes
}
