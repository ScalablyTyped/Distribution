package typings
package argvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait argv extends js.Object {
  // Cleans out current options
  var clear: js.Function0[js.Object]
  // Prints out the help doc
  var help: js.Function1[/* mod */ js.UndefOr[java.lang.String], js.Object]
  // Description setup
  var info: js.Function2[/* mod */ java.lang.String, /* description */ js.UndefOr[module], js.Object]
  // Creating module
  var mod: js.Function1[/* object */ module | js.Array[module], js.Object]
  // Adding options to definitions list
  var option: js.Function1[/* mod */ helpOption | js.Array[helpOption], js.Object]
  // Runs the arguments parser
  var run: js.Function1[/* argv */ js.UndefOr[js.Array[java.lang.String]], args]
  // Creates custom type function
  var `type`: js.Function2[
    /* name */ java.lang.String | org.scalablytyped.runtime.StringDictionary[typeFunction], 
    /* callback */ js.UndefOr[typeFunction], 
    _
  ]
  // Setting version number, and auto setting version option
  var version: js.Function1[/* v */ java.lang.String, js.Object]
}

