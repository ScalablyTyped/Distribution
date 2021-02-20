package typings.akuminaCore.mod.Digispace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.PerfLogger")
@js.native
class PerfLogger () extends StObject
object PerfLogger {
  
  /** Add LoaderMark and mark it start
    * @param mark String Name of mark to be added as Start
    * @param type String
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.PerfLogger.AddLoaderStartMark")
  @js.native
  def AddLoaderStartMark(mark: String, `type`: String): Unit = js.native
  
  /** Mark Stop of a LoaderMark
    * @param mark String Name of mark to be marked as Stop
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.PerfLogger.AddLoaderStopMark")
  @js.native
  def AddLoaderStopMark(mark: String): Unit = js.native
  
  /** To add a new mark
    * @param mark String name of mark
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.PerfLogger.AddMark")
  @js.native
  def AddMark(mark: String): Unit = js.native
  
  /** Measure Performance between two marks
    * @param mark1 Name of mark to compare
    * @param mark2 Name of mark to compare
    * @returns PerformanceMeasure Object
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.PerfLogger.CompareMarks")
  @js.native
  def CompareMarks(mark1: String, mark2: String): js.Any = js.native
  
  /** Gets color from time
    * @param time time in ms
    * @param type short,medium,long
    * @returns yellow green or red
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.PerfLogger.GetColor")
  @js.native
  def GetColor(time: Double, `type`: String): String = js.native
  
  /** Get list of all Loader Marks
    * @returns Array of Loader marks object
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.PerfLogger.GetLoaderMarks")
  @js.native
  def GetLoaderMarks(): js.Array[_] = js.native
  
  /** Get a mark object by mark name
    * @param mark string name of mark
    * @returns object of mark {name: "string", startTime: decimal}
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.PerfLogger.GetMark")
  @js.native
  def GetMark(mark: String): js.Any = js.native
  
  /** Get List of marks added
    * @returns Array of mark objects [{name: "string", startTime: decimal}]
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.PerfLogger.GetMarks")
  @js.native
  def GetMarks(): js.Array[_] = js.native
}
