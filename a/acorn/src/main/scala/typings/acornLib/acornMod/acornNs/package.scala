package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object acornNs {
  type ILooseParserClass = org.scalablytyped.runtime.Instantiable2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[/* options */ Options], 
    ILooseParser
  ]
  // TODO: rename type.
  type IParse = js.Function2[
    /* input */ java.lang.String, 
    /* options */ js.UndefOr[Options], 
    estreeLib.estreeMod.Program
  ]
}
