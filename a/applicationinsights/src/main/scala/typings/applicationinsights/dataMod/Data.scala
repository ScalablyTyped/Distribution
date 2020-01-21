package typings.applicationinsights.dataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data struct to contain both B and C sections.
  */
@js.native
trait Data[TDomain]
  extends typings.applicationinsights.baseMod.^ {
  /**
    * Container for data item (B section).
    */
  var baseData: TDomain = js.native
}

