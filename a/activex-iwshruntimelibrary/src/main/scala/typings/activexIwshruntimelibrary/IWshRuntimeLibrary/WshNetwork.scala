package typings.activexIwshruntimelibrary.IWshRuntimeLibrary

import typings.activexIwshruntimelibrary.activexIwshruntimelibraryBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Network Object */
@js.native
trait WshNetwork extends js.Object {
  
  /**
    * Adds a remote MS-DOS-based printer connection to your computer system.
    * @param LocalName Local name to assign to the connected printer.
    * @param RemoteName Name of the remote printer.
    * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
    *
    * If you are mapping a remote printer using the profile of someone other than current user, you can specify _UserName_ and _Password_.
    */
  def AddPrinterConnection(LocalName: String, RemoteName: String): Unit = js.native
  def AddPrinterConnection(
    LocalName: String,
    RemoteName: String,
    UpdateProfile: js.UndefOr[scala.Nothing],
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: js.UndefOr[scala.Nothing], UserName: String): Unit = js.native
  def AddPrinterConnection(
    LocalName: String,
    RemoteName: String,
    UpdateProfile: js.UndefOr[scala.Nothing],
    UserName: String,
    Password: String
  ): Unit = js.native
  def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Boolean): Unit = js.native
  def AddPrinterConnection(
    LocalName: String,
    RemoteName: String,
    UpdateProfile: Boolean,
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: String): Unit = js.native
  def AddPrinterConnection(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: String, Password: String): Unit = js.native
  
  /**
    * @param string Path to printer connection
    * @param string [DriverName='']
    * @param string [Port='LPT1']
    *
    * Unlike the **AddPrinterConnection** method, this method allows you to create a printer connection without directing it to a specific port, such as LPT1.
    */
  def AddWindowsPrinterConnection(PrinterName: String): Unit = js.native
  def AddWindowsPrinterConnection(PrinterName: String, DriverName: js.UndefOr[scala.Nothing], Port: String): Unit = js.native
  def AddWindowsPrinterConnection(PrinterName: String, DriverName: String): Unit = js.native
  def AddWindowsPrinterConnection(PrinterName: String, DriverName: String, Port: String): Unit = js.native
  
  val ComputerName: String = js.native
  
  def EnumNetworkDrives(): WshCollection = js.native
  
  def EnumPrinterConnections(): WshCollection = js.native
  
  @JSName("IWshRuntimeLibrary.WshNetwork_typekey")
  var IWshRuntimeLibraryDotWshNetwork_typekey: WshNetwork = js.native
  
  /**
    * Adds a remote MS-DOS-based printer connection to your computer system.
    * @param LocalName Name by which the mapped drive will be known locally
    * @param RemoteName Share's UNC name (\\xxx\yyy)
    * @param UpdateProfile [false] Whether the printer mapping is stored in the current user's profile.
    *
    * If you are mapping a network drive using the profile of someone other than current user, you can specify _UserName_ and _Password_.
    */
  def MapNetworkDrive(LocalName: String, RemoteName: String): Unit = js.native
  def MapNetworkDrive(
    LocalName: String,
    RemoteName: String,
    UpdateProfile: js.UndefOr[scala.Nothing],
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: js.UndefOr[scala.Nothing], UserName: String): Unit = js.native
  def MapNetworkDrive(
    LocalName: String,
    RemoteName: String,
    UpdateProfile: js.UndefOr[scala.Nothing],
    UserName: String,
    Password: String
  ): Unit = js.native
  def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Boolean): Unit = js.native
  def MapNetworkDrive(
    LocalName: String,
    RemoteName: String,
    UpdateProfile: Boolean,
    UserName: js.UndefOr[scala.Nothing],
    Password: String
  ): Unit = js.native
  def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: String): Unit = js.native
  def MapNetworkDrive(LocalName: String, RemoteName: String, UpdateProfile: Boolean, UserName: String, Password: String): Unit = js.native
  
  val Organization: String = js.native
  
  /**
    * Removes a shared network drive from your computer system
    * @param Name Name of the mapped drive you want to remove. This will be the drive letter if the drive has a mapping between a local name (drive letter) and a remote name (UNC name);
    * it will be the UNC path if there is no such mapping
    * @param Force [false] Remove the connections even if the resource is in use
    * @param UpdateProfile [false] Remove the mapping from the user's profile
    */
  def RemoveNetworkDrive(Name: String): Unit = js.native
  def RemoveNetworkDrive(Name: String, Force: js.UndefOr[scala.Nothing], UpdateProfile: Boolean): Unit = js.native
  def RemoveNetworkDrive(Name: String, Force: Boolean): Unit = js.native
  def RemoveNetworkDrive(Name: String, Force: Boolean, UpdateProfile: Boolean): Unit = js.native
  
  /**
    * Removes a shared network printer connection from your computer system
    * @param Name Name that identifies the printer. Can be a UNC name (in the form `\\xxx\yyy`) or a local name (such as `LPT1`)
    * @param Force [false] Remove printer connection even if a user is still connected
    * @param UpdateProfile [false] Remove the printer connection from the user's profile
    *
    * The **RemovePrinterConnection** method removes both Windows and MS-DOS based printer connections. If the printer was connected using the method **AddPrinterConnection**,
    * _Name_ must be the printer's local name. If the printer was connected using the **AddWindowsPrinterConnection** method or was added manually (using the Add Printer wizard),
    * then _Name_ must be the printer's UNC name.
    */
  def RemovePrinterConnection(Name: String): Unit = js.native
  @JSName("RemovePrinterConnection")
  def RemovePrinterConnection_true(Name: String, Force: js.UndefOr[scala.Nothing], UpdateProfile: `true`): Unit = js.native
  @JSName("RemovePrinterConnection")
  def RemovePrinterConnection_true(Name: String, Force: `true`): Unit = js.native
  @JSName("RemovePrinterConnection")
  def RemovePrinterConnection_true(Name: String, Force: `true`, UpdateProfile: `true`): Unit = js.native
  
  def SetDefaultPrinter(Name: String): Unit = js.native
  
  val Site: String = js.native
  
  val UserDomain: String = js.native
  
  val UserName: String = js.native
  
  val UserProfile: String = js.native
}
