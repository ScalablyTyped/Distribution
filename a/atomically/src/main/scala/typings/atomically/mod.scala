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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("atomically", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readFile(filePath: Path): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def readFile(filePath: Path, options: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(filePath: Path, options: ReadOptionsencodingstring): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFile(filePath: Path, options: ReadOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def readFileSync(filePath: Path): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def readFileSync(filePath: Path, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readFileSync(filePath: Path, options: ReadOptionsencodingstring): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readFileSync(filePath: Path, options: ReadOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def writeFile(filePath: Path, data: Data): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(filePath: Path, data: Data, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(filePath: Path, data: Data, options: String, callback: Callback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(filePath: Path, data: Data, options: Unit, callback: Callback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(filePath: Path, data: Data, options: Callback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(filePath: Path, data: Data, options: Callback, callback: Callback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(filePath: Path, data: Data, options: WriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFile(filePath: Path, data: Data, options: WriteOptions, callback: Callback): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeFileSync(filePath: Path, data: Data): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(filePath: Path, data: Data, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(filePath: Path, data: Data, options: WriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filePath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
