package typings.atomically

import typings.atomically.anon.ReadOptionsencodingstring
import typings.atomically.typesMod.Callback
import typings.atomically.typesMod.Data
import typings.atomically.typesMod.Path
import typings.atomically.typesMod.ReadOptions
import typings.atomically.typesMod.WriteOptions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("atomically", "readFile")
  @js.native
  def readFile(filePath: Path): js.Promise[Buffer] = js.native
  @JSImport("atomically", "readFile")
  @js.native
  def readFile(filePath: Path, options: String): js.Promise[String] = js.native
  @JSImport("atomically", "readFile")
  @js.native
  def readFile(filePath: Path, options: ReadOptionsencodingstring): js.Promise[String] = js.native
  @JSImport("atomically", "readFile")
  @js.native
  def readFile(filePath: Path, options: ReadOptions): js.Promise[Buffer] = js.native
  
  @JSImport("atomically", "readFileSync")
  @js.native
  def readFileSync(filePath: Path): Buffer = js.native
  @JSImport("atomically", "readFileSync")
  @js.native
  def readFileSync(filePath: Path, options: String): String = js.native
  @JSImport("atomically", "readFileSync")
  @js.native
  def readFileSync(filePath: Path, options: ReadOptionsencodingstring): String = js.native
  @JSImport("atomically", "readFileSync")
  @js.native
  def readFileSync(filePath: Path, options: ReadOptions): Buffer = js.native
  
  @JSImport("atomically", "writeFile")
  @js.native
  def writeFile(filePath: Path, data: Data): js.Promise[Unit] = js.native
  @JSImport("atomically", "writeFile")
  @js.native
  def writeFile(filePath: Path, data: Data, options: js.UndefOr[scala.Nothing], callback: Callback): js.Promise[Unit] = js.native
  @JSImport("atomically", "writeFile")
  @js.native
  def writeFile(filePath: Path, data: Data, options: String): js.Promise[Unit] = js.native
  @JSImport("atomically", "writeFile")
  @js.native
  def writeFile(filePath: Path, data: Data, options: String, callback: Callback): js.Promise[Unit] = js.native
  @JSImport("atomically", "writeFile")
  @js.native
  def writeFile(filePath: Path, data: Data, options: Callback): js.Promise[Unit] = js.native
  @JSImport("atomically", "writeFile")
  @js.native
  def writeFile(filePath: Path, data: Data, options: Callback, callback: Callback): js.Promise[Unit] = js.native
  @JSImport("atomically", "writeFile")
  @js.native
  def writeFile(filePath: Path, data: Data, options: WriteOptions): js.Promise[Unit] = js.native
  @JSImport("atomically", "writeFile")
  @js.native
  def writeFile(filePath: Path, data: Data, options: WriteOptions, callback: Callback): js.Promise[Unit] = js.native
  
  @JSImport("atomically", "writeFileSync")
  @js.native
  def writeFileSync(filePath: Path, data: Data): Unit = js.native
  @JSImport("atomically", "writeFileSync")
  @js.native
  def writeFileSync(filePath: Path, data: Data, options: String): Unit = js.native
  @JSImport("atomically", "writeFileSync")
  @js.native
  def writeFileSync(filePath: Path, data: Data, options: WriteOptions): Unit = js.native
}
