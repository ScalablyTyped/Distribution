package typings.akuminaCore.mod.Digispace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.PerfLogger")
@js.native
class PerfLogger () extends js.Object
/* static members */
@JSImport("akumina-core", "Digispace.PerfLogger")
@js.native
object PerfLogger extends js.Object {
  
  /** Add LoaderMark and mark it start
    * @param mark String Name of mark to be added as Start
    * @param type String
    */
  def AddLoaderStartMark(mark: String, `type`: String): Unit = js.native
  
  /** Mark Stop of a LoaderMark
    * @param mark String Name of mark to be marked as Stop
    */
  def AddLoaderStopMark(mark: String): Unit = js.native
  
  /** To add a new mark
    * @param mark String name of mark
    */
  def AddMark(mark: String): Unit = js.native
  
  /** Measure Performance between two marks
    * @param mark1 Name of mark to compare
    * @param mark2 Name of mark to compare
    * @returns PerformanceMeasure Object
    */
  def CompareMarks(mark1: String, mark2: String): js.Any = js.native
  
  /** Gets color from time
    * @param time time in ms
    * @param type short,medium,long
    * @returns yellow green or red
    */
  def GetColor(time: Double, `type`: String): String = js.native
  
  /** Get list of all Loader Marks
    * @returns Array of Loader marks object
    */
  def GetLoaderMarks(): js.Array[_] = js.native
  
  /** Get a mark object by mark name
    * @param mark string name of mark
    * @returns object of mark {name: "string", startTime: decimal}
    */
  def GetMark(mark: String): js.Any = js.native
  
  /** Get List of marks added
    * @returns Array of mark objects [{name: "string", startTime: decimal}]
    */
  def GetMarks(): js.Array[_] = js.native
}
